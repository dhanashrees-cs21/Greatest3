<html>
  <head>
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  </head>
<body>
  <h2>Greatest of three Numbers</h2>
  <input type="number" id="n1">
  <input type="number" id="n2">
  <input type="number" id="n3">
  <button onclick="Greatest3()"> Greatest31 </button>
  <div id="result"></div>
</body>
</html>
  <script>
    function Greatest3()
    {

       var data = 'n3='+$('#n3').val() + '&n1='+$('#n1').val() + '&n2='+$('#n2').val();
       alert(data)
        $.ajax({
        url: "add.do",
        data: data,
        type: "post",
        success: function (data) {
        alert(data);
           $('#result').html(data);
        }
     });
   }
</script>


