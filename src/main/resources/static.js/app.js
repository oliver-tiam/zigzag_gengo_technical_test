function validate() {
    var answer1 = document.getElementById("answer1").value;
    var answer2 = document.getElementById("answer2").value;
    if (answer1 == '' || answer2 == '') {
        alert("Please enter a valid value");
        return false;
    } else {
        return true;
    }
}