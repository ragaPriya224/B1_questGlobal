console.log('binded');
// alert('code is binded');
// let i = 0;

// for(let i = 0;i<5;i++){
//     console.log(i);//0,1,2,3,4
// }
// console.log('lets check the value of i for let');
// console.log(i); //  value is 0 ->let is block scoped

var j = 0;

for (var j = 0; j < 5; j++) {
    console.log(j);//0,1,2,3,4
}
console.log('lets check the value of j for var');
console.log(j); // 5 -> function scoped
demo();
function demo() {
    var num = 2;
    if (2 == 2) {
        var num = 3;
    }
    console.log(num);

}
calculate();
function calculate() {
    let count = 2;
    {
        let count = 3;
    }
    console.log('**************');
    console.log(count);
}
print(3,'java');
function print(num,name='js') {
    console.log("hello"+num );
    console.log(name);
}
// alert
// x=3
//   if(x<5)
//   {
//   alert ('negative');
//   }
//   else
//   {
//   alert ('positive');
//   }

// confirm pop up box
// c=confirm('Do You Want to Continue')
// if(c){
// alert ('Welcome');
// }else{
// alert ('Thank You');
// }

//prompt pop up box 
p=prompt('Enter the Value', ' ')
if(p== 06){
alert('Welcome')
}else{
alert('Thank you')
}



