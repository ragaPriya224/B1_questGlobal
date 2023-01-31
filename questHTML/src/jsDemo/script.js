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
