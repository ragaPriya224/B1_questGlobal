console.log("welcome to js");
var student ="abc";
console.log(student); //abc
 student =123;
console.log(student); //123
student=false;
console.log(student); //false
var result = 3+2;
console.log(result); //4
const value = 4;
console.log(value);//4
// value = 5;// cannot asign value to constant 
// console.log("welcome to js");
// console.log(value);
console.log(3 == 3);
console.log(3 == '3'); //true  checks value alone 

console.log(4 === '4'); //false checks both type and value
//call function
square(5);
//create function 
function square(num){
    console.log("square function ");
    console.log(num*num);
}
var isStatus=false;
if(2 === '2'){
    isStatus = true;
}
console.log(isStatus);
//array???

let flavours = ['choclate','strawberry','vanilla','pista'];
console.log(flavours[1]);//strawberry
console.log(flavours[3]);//pista
flavours[1] = 'black current';
console.log(flavours[1]); 
console.log(flavours[6]); 
flavours[4] ="butterscotch";
console.log(flavours.length);//return the elements
// console.log('before sortin ${flavours}');
console.log(`before sorting ${flavours}`);
// console.log('before sorting '+flavours);

// console.log(flavours);
flavours.sort();
console.log("after sorting");
console.log(flavours);

for(let i = 0; i  < flavours.length;i++){
    console.log(flavours[i]);
}
// ['black current', 'butterscotch', 'choclate', 'pista', 'vanilla']
let avengers = ['spidy','hulk','thor','captain america'];
let j = 0;
while(j<avengers.length){
    console.log(avengers[j]);  
    j++;
}
// let a = 2;
// for( let a = 0; a<4;a++){
//     console.log(a);
// }
// console.log(a); //2

var b = 2;
for( var b = 0; b<4;b++){
    console.log(b);
}
console.log(b); //4

