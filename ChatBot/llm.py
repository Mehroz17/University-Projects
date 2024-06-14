import  streamlit as st
from langchain_openai import  ChatOpenAI

llm = ChatOpenAI(
    openai_api_key = st.secrets['OPENAI_API_KEY'],
    model = st.secrets['OPENAI_MODEL']
)

## initializing an embedding model
from langchain_openai import OpenAIEmbeddings

embeddings = OpenAIEmbeddings(
    openai_api_key = st.secrets['OPENAI_API_KEY']

)
