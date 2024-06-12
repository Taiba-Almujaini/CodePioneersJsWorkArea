"# CodePioneersJsWorkArea" 

# Prompt to generate the UI

write me an index.html file using bootstrap, it should look professional, should use and orange white theme.
I need the UI to have a list that will be populated by sending a GET request (using fetch) to this url: http://localhost:8080/api/v1/todolist which will give me the response like this:
  
  `[{
      "id": "1",
      "desc": "1st item desc"},
  {
      "id": "2",
      "desc": "2nd item desc"
  }]`

i need you to display this response in a table like element, having 2 columns, 1st column is ID and the seconds is Description.

I also need to see a forum with an ID and description field, that would allow me to create items by sending a POST request to http://localhost:8080/api/v1/todolist and if the response code is 200, display a success message on the header somewhere, otherwise display a failure and also console log the exception


