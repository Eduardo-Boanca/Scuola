    // Add your code here

    let quoteStart = "Don't judge each day ";
    let quoteEnd = "by the harvest you reap";
    let finalQuote = quoteStart + quoteEnd;

    // Don't edit the code below here!

    const section = document.querySelector('section');
    let para1 = document.createElement('p');
    para1.textContent = finalQuote;

    section.appendChild(para1);