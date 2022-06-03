const missingValue = num => {

    console.log(num) ;

    const max = Math.max(...num); // maximum number in the sequence
    const min = Math.min(...num); // minimum number in the sequence
    const missingNum = []

    for(let i=min; i<= max; i++) {
      if(!num.includes(i)) { 
        missingNum.push(i);
        console.log("Missing value is: " + i);

      }
    }


    //If the missing number is starting one or end one
    if(missingNum.length < 1){
      console.log("Missing value is in one end")

      missingNum.push(min-1);
      missingNum.push(max+1);

      console.log("If starting number is missing, missing value is :"+ missingNum[0]);
      console.log("If ending number is missing, missing value is :"+ missingNum[1]);


    }
  }

  console.log("Given Example:")
  missingValue([21,25,29,28,22,24,27,26,30]);

  console.log("===========================================================================");

  console.log("Example if starting value or ending value is missing:");
  missingValue([64,67,62,63,65,66])
 
