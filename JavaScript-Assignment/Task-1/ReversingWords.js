



let reverseWords = (sentence) => {
    
    var words = sentence.split(' ');
    
    var reversedWords = words.map((word) => {
        return word.split('').reverse().join("");
    });

    
    var reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}


var inputSentence = "This is a sunny day";

var reversed = reverseWords(inputSentence);
console.log(reversed);