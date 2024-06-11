const tableBodyObj = document.getElementById("tableBody");

for (let i=0; i<5; i++) {
  const newTrObj = document.createElement("tr");

  const newDataCol1 = document.createElement("td");
  newDataCol1.innerText = "Custom Attribute 1";

  const newDataCol2 = document.createElement("td");
  newDataCol2.innerText = "Attribute Value 1";

  newTrObj.appendChild(newDataCol1);
  newTrObj.appendChild(newDataCol2);

  tableBodyObj.appendChild(newTrObj);
}

const listOfAttrib = ["Custom Attribute 1", "Custom Attribute 2", "Custom Attribute 3"]

listOfAttrib.forEach((attribName) => {
  const newTrObj = document.createElement("tr");

  const newDataCol1 = document.createElement("td");
  newDataCol1.innerText = attribName;

  const newDataCol2 = document.createElement("td");
  newDataCol2.innerText = "Attribute Value 1";

  newTrObj.appendChild(newDataCol1);
  newTrObj.appendChild(newDataCol2);

  tableBodyObj.appendChild(newTrObj);
});
  