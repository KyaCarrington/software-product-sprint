// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['I have only been coding for four years!', 'My favorite TV show is New Girl', 'I played volleyball for 6 years', 
      'My favorite color is blue','I love going to sporting events','I enjoy baking','I have two siblings',
    'I work at PWC this summer','I am familiar with VSCode','I created this website with Google Cloud Shell',
    'I have created 4 websites','I enjoy CyberSecurity','My favorite programming language is Python','My favorite food is shrimp'
    ];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}

async function showtheMessage(){
    const responseFromServer = await fetch('/hello');
    const myObject = await responseFromServer.json();
    const randomFact = myObject[Math.floor(Math.random()*myObject.length)];
    const helloWorldContainer = document.getElementById('hello-world-container');
    helloWorldContainer.innertext = randomFact; 
} 


