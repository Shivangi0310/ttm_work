$(function () {

    $('.loading').hide();

    $('body').on('click', '#alertBtn', function () {
        alert("Hello");
        console.log("alert");
    });

    $.ajax(
        startLoader(), {

            url: '/current-time',
            method: 'get',
            success: function (response) {
                stopLoader();
                console.log(response);
                if (response.status === true) {
                    $('#currentTime').text(response.data)
                } else {
                    alert("Error")
                }

            }
        })

    function startLoader() {
        $('.loading').show();
    }

    function stopLoader() {
        $('.loading').hide();
    }

    $('body').on('click', '.start', function () {

        $('.loading').show();

    });

    $('body').on('click', '.stop', function () {
        $('.loading').stop();

    });

   $("#dropdown").change( function () {
       var var1=document.getElementById("dropdown").value;
        alert(var1);
        console.log("alert");
    });

});