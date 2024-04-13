import React, { useState } from 'react'
import axios from 'axios'

/* 
This file contains the code for connecting
 to the Stable Diffusion API.
*/

const buffer = require('buffer')


const  ApiConnection = ()=> {
    const [ loading ,setLoading]= useState();
    const [error , setError] = useState('')
    const [image_url , setImageURL] = useState('');


    // function to generate image
    const generate_images = async (prompt) => {
        setLoading(true);
        try{
            const response = await axios.post("http://192.168.86.1:4000/generate_image", 
            { text: prompt },{responseType:'arraybuffer'}
            );
            console.log("Loading ")
            const base64Image = `data:image/jpg;base64,${buffer.Buffer.from(response.data, 'binary').toString('base64')}`;
            setImageURL(base64Image);
           
        }
        catch(error){
            setError(error);

            console.log("error from the api",error)
        }
        finally{
            setLoading(false)
        }
    };


    return{loading, error , image_url , generate_images};
};

export default ApiConnection;
