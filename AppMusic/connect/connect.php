<?php
        $hostname ="localhost";
        $username ="id16340680_makeappmusic";
        $password ="CiL>pp]uW6Jxe8yT";
        $dbname= "id16340680_appmusic";
        $conn = mysqli_connect($hostname, $username , $password , $dbname); 
       mysqli_query($conn, " SET NAMES 'utf8'");
       //SELECT quangcao.*, baihat.tenBaiHat, baihat.hinhBaiHat FROM `baihat` LEFT JOIN quangcao ON baihat.IdBaiHat =baihat.IdBaiHat WHERE quangcao.idBaiHat=baihat.IdBaiHat

?>