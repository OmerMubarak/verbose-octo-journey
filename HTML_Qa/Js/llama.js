// 'use strict'; // ensures code runs with the highest standard.

// let a = 0;
// while(a = 0){
//     a++
//     if (a > 200){
//         return a;
//     }
//     console.log(a)
// }

// for (let i = 100; i < 200; i++){
//     console.log(i);
// }

// Recreate the following flowchart as a loop.
// let a = 100;
// while (a <= 200){
//     if (a%2 == 0){
//         console.log("-");
//     }
//     console.log("*");
//     a++

// }

// Create a method that can print out the numbers 1-10 10 times each.
// for(let i = 0; i <11; i++){
//     for(j = 0; j< 11; j++){
//     console.log(j);
// }
// }

// let now = new Date(); 
// let day = now.getDay();
// switch (day) {
//   case 0:
//     console.log(`It's Sunday`);
//     break;
//   case 6:
//     console.log(`It's Saturday`);
//     break;
//   case 1:
//     console.log(`It's Monday`);
//   case 2:
//   case 3:
//   case 4:
//     console.log(`It's a weekday`);
//     break;
//   case 5:
//     console.log(`It's a Friday!`);
//     break;
//   default:
//     console.log(`Excuse me?`);
//     break;
// }

// let greeting = "Good";
// if (now.getHours() > 17) {
//   greeting += " evening.";
// } else {
//   greeting += " day.";
// }

// console.log(greeting);


// let age = 18;

// while(age >= 18 && age <= 65){
//     console.log(age);
// }

// let snailDepth = 20;
// let snailClimb = -5;

// let snailOut = true;
// let distance = 0;
// let days = 1;

// while (snailOut) {
//     console.log("Trudging through the day..")
//     days++;
//     if (days >= snailDepth) {
//         snailOut = false;
//         console.log("im Out!");
//     }
// }

const area = function(width, height) {
    return width * height;
}

console.log(area(20,40));

const print = (par) => console.log(par);

const Area = (height, width) => console.log(height * width);

Area(2,4);
