<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/1
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
    <script>
        window.onload=function () {
            var files=document.getElementById("files");
            files.addEventListener("change",onFileSelect,false);
            var uploadButton=document.getElementById("uploadButton");
            uploadButton.addEventListener("click",startUpload,false);
        }
    </script>
</head>
<body>
  <h1>Multiple file uploads width progress bar</h1>
  <div id="progressBar" style="height: 20px;border: 2px solid green">
      <div id="bar" style="height: 100%; background-color: #33dd33;width: 0%;"></div>
  </div>
<form>
    <input type="file" id="files" multiple>
    <br/>
    <output id="selectedFiles"></output>
    <input id="uploadButton" type="button" value="Upload"/>
</form>
<div id="debug" style="height: 100px;border: 2px solid green; overflow: auto"></div>
</body>
<script>
    var totalFileLength,totalUpload,fileCount,filesUploaded;

    function startUpload(){
        totalUpload=filesUploaded=0;
        uploadNext();
    }
    function uploadNext(){
        var xhr=new XMLHttpRequest();
        var fd=new FormData();
        var file=document.getElementById("files").files[filesUploaded];
        fd.append("multipartFile",file);
        xhr.upload.addEventListener("progress",onUploadProgress,false);
        xhr.addEventListener("load",onUploadComplete,false);
        xhr.addEventListener("error",onUploadFailed,false);
        xhr.open("post","file_upload.do");
        debug("uploading"+file.name);
        xhr.send(fd);

    }
    function onUploadProgress (e){
        if(e.lengthComputable){
            var percentComplete=parseInt((e.loaded+totalUpload)*100/totalFileLength);
            var bar=document.getElementById("bar");
            bar.style.width=percentComplete+'%';
            bar.innerHTML=percentComplete+'% Complete';
        }else{
            debug("unable to complete");
        }
    }
    function onUploadFailed(){
        alert("Error uploading File");
    }
    function onUploadComplete() {
        totalUpload+=document.getElementById("files").files[filesUploaded].size;
        filesUploaded++;
        debug("complete"+ filesUploaded+'of'+fileCount);
        debug("totalUploaded:"+totalUpload);
        if(filesUploaded<fileCount){
            uploadNext();
        }else{
            var bar=document.getElementById("bar");
            bar.style.width='100%';
            bar.innerHTML='100% Complete';
            alert("Finished uploading file(s)");
        }
    }

    function onFileSelect(e){
        var files=e.target.files;
        var output=[];
        fileCount=files.length;
        totalFileLength=0;
        for(var i=0;i<fileCount;i++){
            var file=files[i];
            output.push(file.name,'(',file.size,'bytes,',file.lastModifiedDate.toLocaleDateString(),')');
            output.push("<br/>");
            debug("add"+file.size);
            totalFileLength+=file.size;
        }
        document.getElementById("selectedFiles").innerHTML=output.join('');
        debug("totalFileLength:"+totalFileLength);
    }

    function debug(string){
        var debug=document.getElementById("debug");
        if(debug){
            debug.innerHTML+='<br/>'+string;
        }
    }
</script>
</html>
