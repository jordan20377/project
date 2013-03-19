<?php 
//獲取搜索關鍵字 
$keyword=trim($_POST[“keyword”]); 
//檢查是否為空 
if($keyword==””){ 
echo ”您要搜索的關鍵字不能為空”; 
exit;//結束程序 
} 
?>