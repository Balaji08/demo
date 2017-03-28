function func()
{

var formData = $("#myform").serializeArray();
var URL = $("#myform").attr("action");
        $.post("DemoServ",
        formData,
        function(data,status){
            alert("Data: " + data + "\nStatus: " + status);
        });
    
}