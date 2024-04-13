class Stack {
    constructor(){
        this.items = [];
    }

    getItems(){
        return this.items;
    }
    
    push(obj){
        this.items.push(obj);
    }

    peek() {
        return this.isEmpty()? null : this.items[this.items.length-1];
    }

    pop() {
        return this.isEmpty()? null : this.items.pop();
    }

    isEmpty(){
        return this.size() == 0;
    }

    size() {
        return this.items.length;
    }

    clear() {
        this.items = [];
    }
}

export default Stack;