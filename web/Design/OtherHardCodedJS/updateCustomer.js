/**
 * Created by abdullah on 6/8/17.
 */

var rownumber;
var argument;

//<script src="/resources/OtherHardCodedJS/updateCustomer.js"></script>

function setrowValues() {
    argument=arguments;
    rownumber=arguments[0];

    alert("Name : " + argument[1]);

   // alert("Row index is: " + arguments[0]);
    //alert("Name : " + arguments[1]);
    /*
    document.getElementById("pid").value=parseInt(arguments[0]);
    document.getElementById("pname").value=arguments[1];
    document.getElementById("pmobile").value=arguments[2];
    document.getElementById("pemail").value=arguments[3] ;
    document.getElementById("paddress").value=arguments[4];
    document.getElementById("ppincode").value=arguments[5];
    document.getElementById("pcountry").value=arguments[6];
    document.getElementById("pcity").value=arguments[7];
    document.getElementById("pbankdetails").value=arguments[8];
    window.document.location='#UpdateModal';
    */

}

