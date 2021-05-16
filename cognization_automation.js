
let puppeteer=require('puppeteer');

(async () => {

    const browser = await puppeteer.launch({ headless: false 
        ,defaultViewport: null,
        slowMo:8,
       args: ['--start-maximized'] 
    })
    const page = await browser.newPage()
try{
    console.log('enter1');
await page.goto('https://cognizantee.tekstac.com/login/index.php');


console.log('enter2');
await page.type('#username', "khandagaless@rknec.edu");
await page.type('#password', "Saibaba54321@");
await page.click('#loginbtn');

console.log('enter3');
//await page.goto('https://cognizantee.tekstac.com/mod/vpl/forms/edit.php?id=4291&userid=31940')
await page.goto('https://cognizantee.tekstac.com/mod/vpl/forms/edit.php?id=4353&userid=31940#')

await page.waitForSelector('#vpl_file0 .ace_layer.ace_text-layer .ace_line');
// await page.keyboard.down('Control');
// await page.keyboard.press('a')
// await page.keyboard.press('x')
// await page.keyboard.up('Control');
console.log('before');
await page.click('#vpl_file0 .ace_layer.ace_text-layer .ace_line');
console.log("After click");
page.type('#vpl_file0 .ace_layer.ace_text-layer .ace_line',`
<!DOCTYPE html>
<html>
    <head>
        <style>
            h1
            {
                font-style: italic;
                font-weight: bold;
                text-align: center;
                color: #b03060;
            }
            table{
                margin-left: 35%;
                border-style: solid 5px;
                border-width: 30%;
            }
            tr,td{
                padding: 10px;
                border-style: solid;
                border-width: 2px;
            }
            #submit{
                float: left;
                width: 45%;
                margin-left: 45%;
            }
            div{
                text-align: center;
                font-weight: bold;
            }
            #result{
                font-style: italic;
                color: #FF0000;
                font-size: 40px;
            }
            #discount{
                font-size: 25px;
            }
        </style>
    </head>
    <body style="background-color:#99FFFF;">
        <h1>DISCOUNT PRICE</h1>
        <form>
            <table>
                <tr>
                    <td>Product Name</td>
                    <td><input type="text" name="name" id="name" pattern="[a-zA-Z0-9 ]+" required> </td>
                </tr>
                <tr>
                    <td>Product Price</td>
                    <td><input type="number" name="price" min="15001" id="price" required></td>
                </tr>
                <tr>
                    <td>Season</td>
                    <td>
                        <select name="season" id="season">
                        <option value="summer">SUMMER SALE</option>
                        <option value="newyear">NEW YEAR SALE</option>
                        <option value="clearance">CLEARANCE SALE</option>
                        </select>
                    </td>
                </tr>
            </table><br>
            <input type="submit" value="GET DISCOUNT PRICE" id="submit" name="submit" onclick="discount()">
        </form>
        <div id="discount"></div>
        <div id="result"></div>
        <script>
            function discount(){
                var p=document.getElementById("price").value;
                var s=document.getElementById("season").value;
                var d;
                if(s=="summer"){
                    document.getElementById("discount").innerHTML="The discount is 10%";
                    d=(p-(p*0.1));
                }
                else if(s=="newyear"){
                    document.getElementById("discount").innerHTML="The discount is 5%";
                    d=(p-(p*0.05));
                }
                else if(s=="clearance"){
                    document.getElementById("discount").innerHTML="The discount is 15%";
                    d=(p-(p*0.15));
                }
                document.getElementById("result").innerHTML="The discounted price : Rs "+d;
            }
        </script>
    </body>
</html>
`);
console.log();
}catch(e){}
})();
