async function uploadFile() {
    let formData = new FormData();
    const fileInput = document.getElementById('file-input')

    formData.append("file", fileInput.files[0]);
    const response = await fetch("/upload", {
        method: "POST",
        body: formData,
    })

    if (response.status == 200) alert("nice, your file has been uploaded.");
}