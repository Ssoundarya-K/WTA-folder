<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table,th,td{
            border: 1px solid black;
        }
        th,td{
           padding:10px; 
        }
    </style>
</head>
<body>
    <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>" method="POST">
    <h1>Employee searching form</h1>
    <label>Employee number</label>
    <input type="number" name="number" placeholder="Enter the number">
    <br><br>
    <input type="submit" name="save">
    <input type="reset" name="reset">
    </form>
</body>
</html>
<?php
$host="localhost";
$user="root";
$password="";
$dbname="sample";
$conn = new mysqli($host,$user,$password,$dbname);
if($conn->connect_error){
    die("connection failed".$conn->connect_error);
}
else{
    if(isset($_POST["save"])){
        $number = $_POST["number"];
        $sql = "SELECT * from employee where number = $number";
        $result = $conn->query($sql);
        if($result->num_rows>0){
            $row = $result->fetch_assoc();
            echo "<br><br><table><tr><th>Employee number</th><td>".$row["number"]."</td></tr><tr><th>Employee name</th><td>".$row["name"]."</td></tr><tr><th>Employee salary</th><td>".$row["salary"]."</td></tr></table>";
        }
        else{
            echo "ERROR";
        }
    }
$conn->close();
}
?>