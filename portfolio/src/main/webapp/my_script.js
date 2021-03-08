async function showHelloWorld() {
  const responseFromServer = await fetch('/mypage.html');
  const textFromResponse = await responseFromServer.text();
  const myContainer = document.getElementById('my-container');
  myContainer.innerText = textFromResponse;
  
}