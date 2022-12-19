<h1> JSON API Tutorial </h1>
<h2>sample JSON response for a request to a sports scores API</h2>

{
    "sports":[
       {
          "name":"basketball",
          //any API similar to this will use internal numeric IDs for the various elements
          "id":5,
          "leagues":[
             {
                "name":"NBA",
                "id":2,
                //element for all games on a day
                "events":[
                   {
                      "id":565465465,
                      "date":"2022-12-15",
                      "season":{
                         "year":2022-2023,
                         "description":"regular season",
                      },
                      //element for specific game
                      "Game":[
                         {
                            "id":4165165565,
                            "date":"2022-12-15",
                            "completed": true,
                            "competitors":[
                               {
                                  "type":"team",
                                  "score":95,
                                  "homeAway":"home",
                                  "isWinner":false,
                                  "team":{
                                     "id":8,
                                     "homeAway":"home",
                                     "teamLocation":"Boston",
                                     "teamMascot":"Celtics"
                                     }
                                  },
                                {
                                    "type":"team",
                                    "score":105,
                                    "homeAway":"away",
                                    "isWinner":true,
                                    "team":{
                                        "id":15,
                                        "homeAway":"home",
                                        "teamLocation":"Chicago",
                                        "teamMascot":"Bulls"
                                        }
                                }
                            }
                            ]
                        ]
                    ]
               }
