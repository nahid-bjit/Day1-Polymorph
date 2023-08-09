class Item {
    constructor(weight){
        this.weight = weight;
    }
}

// const item1 = new Item(10)
// console.log(item1.weight)

class Pen extends Item{
    constructor(name,weight){
        super(weight);
        this.name=name;
    }

}

// const pen1 = new Pen("matador", 10)
// console.log(pen1)

class Pencil extends Item{
    constructor(name,weight){
        super(weight);
        this.name=name;
    }

}

// const pencil1 = new Pencil("matadora", 5)
// console.log(pencil1)

class Bag {
    constructor(initialWeight, currentweight){
        this.initialWeight = initialWeight
        this.currentweight = initialWeight

    }
    canAddItem(Item){
        // console.log(this.initialWeight+Item.weight)
        return this.currentweight + Item.weight <= 20
    }

    addItem(Item){
        this.canAddItem(Item)? console.log("Item added"): console.log("Bag is overloaded")
        this.currentweight += Item.weight;
        console.log ("Current Weight: ", this.currentweight)
    }
}


const bag1 = new Bag(5)
const pen1 = new Pen("matador", 5)
const pencil1 = new Pencil("altime", 5)

bag1.addItem(pen1)

