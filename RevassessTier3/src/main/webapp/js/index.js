/**
 * use the provided url to receive the
 * json object and assign it to the resp
 * variable in this function. this is for 
 * testing purposes, do not change the getResp
 * function and leave the function names alone. 
 * the url for the api is:
 *  http://ec2-3-19-123-54.us-east-2.compute.amazonaws.com:9999/flashcard
 */
window.addEventListener('load',callFlashcardApi);

let resp;

//assign the returned json to the resp variable
async function callFlashcardApi(){
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            resp = JSON.parse(xhr.responseText);
        }
    }

    xhr.open("GET", "http://ec2-3-19-123-54.us-east-2.compute.amazonaws.com:9999/flashcard");

    xhr.send();
}

//manipulate the dom with this function
function manipDom() {
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            resp = JSON.parse(xhr.responseText);

            // Test 3
            $("#cardId").append(resp["flashcards"][0].id);
            $("#cardQstn").append(resp["flashcards"][0].question);
            $("#cardAns").append(resp["flashcards"][0].answer);
            $("#cardCat").append(resp["flashcards"][0].category);
        }
    }

    xhr.open("GET", "http://ec2-3-19-123-54.us-east-2.compute.amazonaws.com:9999/flashcard");

    xhr.send();
}

function carousel() {
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            resp = JSON.parse(xhr.responseText);

            $(
                '<div class="container">' +
                    '<div id="carousel" class="carousel slide" data-interval="false">' +
                        '<div class="carousel-inner"></div>' +
                        '<a class="carousel-control-prev" href="#carousel" role="button" data-slide="prev">' +
                            '<span class="carousel-control-prev-icon" aria-hidden="true"></span>' +
                            '<span class="sr-only">Previous</span>' +
                        '</a>' +
                        '<a class="carousel-control-next" href="#carousel" role="button" data-slide="next">' +
                            '<span class="carousel-control-next-icon" aria-hidden="true"></span>' +
                            '<span class="sr-only">Next</span>' +
                        '</a>' +
                    '</div>' +
                '</div>'
            ).appendTo('#main');

            for (let i = 0; i < resp["flashcards"].length; i++) {
                $(
                    '<div class="carousel-item">' +
                    '<p id="cardId">' + resp["flashcards"][i].id + '</p>' +
                    '<p id="cardQstn">' + resp["flashcards"][i].question + '</p>' +
                    '<p id="cardAns">' + resp["flashcards"][i].answer + '</p>' +
                    '<p id="cardCat">' + resp["flashcards"][i].category + '</p>' +
                    '</div>'
                ).appendTo('.carousel-inner');
                $('<li data-target="#carousel" data-slide-to="' + i + '"></li>').appendTo('.carousel-indicators');
            }
            $('.carousel-item').first().addClass('active');
            $('#carousel').carousel();
        }
    }

    xhr.open("GET", "http://ec2-3-19-123-54.us-east-2.compute.amazonaws.com:9999/flashcard");

    xhr.send();
}

//this returns the variable that holds the json received from the api
function getResp(){
    return resp;
}
