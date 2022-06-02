const missingValue = num => {
    const max = Math.max(...num); // maximum number in the sequence
    const min = Math.min(...num); // minimum number in the sequence
    const missingNum = []
  
    for(let i=min; i<= max; i++) {
      if(!num.includes(i)) { // Checking whether i(current value) present in num(argument)
        missingNum.push(i); // push the missing number
      }
    }

    //If the missing number is starting one or end one
    if(missingNum.length < 1){
      console.log("You are in one end")

      missingNum.push(min-1);
      missingNum.push(max+1);
    }

    return missingNum;
  }
  

  console.log("Missing value of [64,67,62,63,65,66] is " + missingValue([64,67,62,63,65,66]));
  console.log("Missing value of [21,25,29,28,22,24,27,26,30] is " + missingValue([21,25,29,28,22,24,27,26,30]));