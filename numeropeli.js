#!/usr/bin/env node
var readline = require('readline');

var count_of_questions = 3;
var random_number = Math.floor(Math.random() * (10 - 1) + 1);

console.log("Arvaa numero 1-10 välillä, sinulla on käytettävissä 3 arvausta.");

var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function ask_number() {
    rl.question("Anna numero >", function(answer) {
        loop(answer);        
    });
}

function loop(answer) {

    count_of_questions -= 1;

    if( count_of_questions <= 0 ) {
        console.log("Käytit kaikki arvauksesi, moi.")
        rl.close();
        return;
    }

    if( answer == random_number ) {
        console.log("Arvasit oikein");
        rl.close();
        return;
    }

    if( answer > random_number ) {
        console.log("Numero on pienempi");
    }        

    if( answer < random_number ) {
        console.log("Numero on suurempi");
    }

    ask_number();        
}

ask_number();