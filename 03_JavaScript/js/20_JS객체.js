/* JS 객체
  - { K:V, K:V, K:V } 형태

  - (중요) Key는 무조건 문자열(string)
    -> "Key", 'key', key  ("", '' 작성 안해도 string으로 인식)

  - key는 오름차순으로 정렬된다, 순서변경 불가능함, 객체에선 순서보다 존재유무가 중요함
*/

/* {} 객체 생성 + 다루기 */

const btn1 = document.querySelector("#btn1");

btn1.addEventListener("click", ()=>{
  // 1. 객체 생성
  //const product = {}; // 비어있는 객체 생성

  const product = {
    "최애" : "우지,원우",
    '그룹' : "세븐틴",
    데뷔일 : 150526 
  };

  console.log(product);
  
// ----------------------------------------------------
// 2. 객체 내 key 값을 이용해 원하는 value 얻어오기

// 1) 객체명.key
console.log(product.최애,product.그룹, product.데뷔일);

// 2) 객체명["key"]
console.log(product["최애"], product['그룹'], product["데뷔일"]);


  
  // ----------------------------------------------------
  // 3. 객체에 K:V 추가

  // 원하는 key를 생각해두고 

  // 객체명.key = value ;  
  // 또는  
  // 객체명["key"] = value;

  product.color= ['red', 'pink', 'skyblue']

  console.log(product);
  console.log("컬러 :", product.color[2]);

  product["carrt"]=["캐럿은", '세븐틴의', "홈홈홈홈"]
  console.log("캐럿 추가후 : ",  product);

  // ----------------------------------------------------
  // 4. 특정 key의 value 수정하기
  // -> 덮어쓰기

  product.데뷔일= 160214;
  console.log("데뷔일 변경 후 : ",product);

  // ----------------------------------------------------
  // 5. 원하는 K:V 삭제하기(delete 연산자 사용)
  // -  delete 객체명.key

  delete product.데뷔일;
  console.log("delete 후 product : ", product);

});

// =========================================================

const btn2 = document.querySelector("#btn2");

btn2.addEventListener("click", ()=>{

  const smart= {};

  smart.name= "아이폰15";
  smart.price = 1700000;

  // 메서드(객체의 기능(함수)) 추가
  smart["information"] = function(){
    // console.log("정상 수행 확인");

    const brand = "apple";
    console.log("모델명 : ", this.name);
    console.log("가격 : ",  this.price);
    console.log("브랜드 : ", this.brand);
    console.log("브랜드 : ", brand);
    // this는 smart["information"]=funtion의 객체
    // 브랜드는 내부에 써있음... 

  }

  // 메서드 수행
  smart.information();

  // 매개 변수가 존재하는 메서드

  smart.call = function(number){

    console.log(`${number}로 전화를 거는중...`);
  }
  // 매개 변수가 존재하는 메서드 호출하기
  smart.call("010-1234-1234");


  // (참고) 메서드 생성 시 화살표 함수 + this 사용
  // -> 화살표 함수 내에서 this는 Window 객체를 나타낸다!
  // * 객체 메서드 작성 시 function(){} 구문 사용을 권장



  smart.test1 = function(){
    console.log(this); // smart 객체
  }

  smart.test1();

  // 화살표 함수 사용 
  smart.test2 = () => {
    console.log(this);  // -> Window 객체
  }

  smart.test2();




});




