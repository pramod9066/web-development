$(document).ready(function () {
    $.ajax({
        type: 'POST',
        url: 'http://192.168.90.203:9800/nw/api/identity/user/getProfile',
        data: '{"userNwId":"pramod"}',
        success: function (data) {
            userdetails = JSON.stringify(data);
            $.fn.user(userdetails);
        },
        contentType: "application/json",
        dataType: 'json'
    });


    // $.ajax({
    //     type: 'POST',
    //     url: 'http://192.168.90.206:10200/nw/api/wall/story/getStory',
    //     data: '{"userNwId": "Pramod","storyId": "OyPWg3I2SZ"}',
    //     success: function (data1) {
    //         console.log(data1);
    //     },
    //     contentType: "application/json",
    //     dataType: 'json'
    // });


    $.getJSON("http://192.168.90.203:9010/nw/api/wall/v1/home/utility/getBanners",
        function (data) {
            var str = JSON.stringify(data);
            var json = JSON.parse(str);
            $.fn.bannerFunc(json);
        });

    $.fn.user = function (userdetails) {
        var json = JSON.parse(userdetails);
        var username = json.nwResResult.username;
        var email = json.nwResResult.email;
        //  $("#print").html('<h3>The following are the list: </h3> <ul style="list-style: square"> <li>first line in the list </li><li>second line in the list </li></ul>');
        $("#name").text(username).css("color", "black");
        $("#email").text(email).css("color", "black");
        $(".card-title").append(username).css("color", "black");
        $(".card-email").append(email).css("color", "black");
        $(".card-phone").append(json.nwResResult.phoneNumber).css("color", "black");
    }

    $.fn.bannerFunc = function (bannerObject) {
        var banner1 = bannerObject.nwResResult[0].bannerImage;
        var bannertitle1 = bannerObject.nwResResult[0].bannerTitle;
        var banner2 = bannerObject.nwResResult[1].bannerImage;
        var bannertitle2 = bannerObject.nwResResult[1].bannerTitle;
        var banner3 = bannerObject.nwResResult[2].bannerImage;
        var bannertitle3 = bannerObject.nwResResult[2].bannerTitle;

        $("#banner1").attr('src', banner1);
        $("#bannertitle1").text(bannertitle1);

        $("#banner2").attr('src', banner2);
        $("#bannertitle2").text(bannertitle2);

        $("#bannertitle3").text(bannertitle3);
        $("#banner3").attr('src', banner3);
    }


    $("#myBtn").click(function () {
        $("#myModal").modal();
    });

    $(".nav-tabs a").click(function () {
        $(this).tab('show');
    });
});

