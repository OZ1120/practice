/* 매개 변수, 전달 인자 */

const input1 = document.querySelector("#input1")
const btn1 = document.querySelector("#btn1")


function print1(num, str){// num, str 이 매개 변수
  console.log(`${num} 은/는 ${str} 입니다`);
}

/* #btn1 클릭시 #input1의 값을 읽어와 print1() 함수 호출 */

      //이벤트 리스너
btn1.addEventListener("click", ()=>{

  const inp1=input1.value;
  // input1에 값이 입력이 안되었거나, 빈칸만 입력된 경우

  if(inp1.trim().length == 0){
    console.log("숫자를 입력해 주세요");
    return;
  }

  // input1 에 입력 받은값이 양수 음수 0 인지 판별
  let result;  // result라는 변수 만듬

  if(Number(inp1)==0) result= "0"
  else if(Number(inp1)>0) result="양수"
  else  result="음수"

    /* 함수 호출(값 전달) */
    /* [!!중요!!] 전달되는 값의 순서가 중요하다!! */
  print1(inp1, result);
  print1(result,inp1);
})

/* 매개 변수로 배열 전달하기 */
function arrayTest(arr){
  
  
    // 전달 받은 배열의 모든 요소 출력하기
    for(let i=0; i<arr.length; i++){

      if(arr[i] == "홍지수") arr[i]="전원우"

      console.log(`${i}번 인덱스 값 :`, arr[i]);
    }
  
}

/* #btn2a 클릭 되었을 때 arrayTest() 함수 호출 */
document.querySelector("#btn2a").addEventListener("click", ()=>{
  const arr1 = [1,2,3];
  const arr2 = ['최승철', '윤정한', '홍지수'];

  
  arrayTest(arr1);
  arrayTest(arr2);

  console.log(arr2[2]);
})
