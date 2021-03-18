<?php

    require ('connect.php');
    $query ="SELECT quangcao.*, baihat.tenBaiHat, baihat.hinhBaiHat 
    FROM `baihat` LEFT JOIN quangcao ON baihat.IdBaiHat = baihat.IdBaiHat 
    WHERE quangcao.idBaiHat=baihat.IdBaiHat";
    $data =mysqli_query($conn, $query);
    class QuangCao{
        function QuangCao($idQuangCao, $idHinhAnh, $noiDung,$idBaiHat, $tenBaiHat, $hinhBaiHat){
            $this->idQuangCao =$idQuangCao;
            $this->idHinhAnh =$idHinhAnh;
            $this->noiDung =$noiDung;
            $this->idBaiHat =$idBaiHat;
            $this->tenBaiHat =$tenBaiHat;
            $this->hinhBaiHat =$hinhBaiHat;
        }
    }
        $mangQuangCao = array();
        while($row = mysqli_fetch_assoc($data)){
            array_push($mangQuangCao,new QuangCao($row['id']
        ,$row['hinhAnh'],$row['noiDung'],$row['idBaiHat'], $row['tenBaiHat'],$row['hinhBaiHat'] ));
        //push du lieu vao mang $mangQuangcao
        }

        //in mang ra du dang json
        echo json_encode($mangQuangCao);

?>