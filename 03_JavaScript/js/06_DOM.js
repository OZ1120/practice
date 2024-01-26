/* Node 확인하기 */

document.querySelector("#btn1").addEventListener("click", ()=>{
  const test= document.querySelector("#test")

  // #test의 모든 자식 노드 얻어오기(요소.childNodes) ->배열
  
  const list  = test.childNodes;
  console.log(list);

  // 자식 노드 중 첫 번째 li 요소
  const li1 = list[3];
  console.log(li1);

  // 1. 부모 노드 찾기(요소.parentNode)
  // -> li1의 부모 노드 배경색 변경하기
  li1.parentNode.style.backgroundColor="skyblue";

  // 2.첫 번째 자식 노드 찾기(요소.firstChild)
  // -> #test(ul태그)의 첫번째 자식 노드 찾기
  console.log(test.firstChild); 


  // 3. 마지막 자식 노드 찾기(요소.lastChild)
  // -> #test(ul태그) 의 마지막 자식 노드 찾기
  console.log(test.lastChild);

  // 4. 원하는 위치(index)에 존재하는 자식 노드 찾기
  //   (요소.childNodes[index])

  //   -> #test의 자식 노드 중
  //      3번째 li 태그를 찾아서 배경색 pink 지정하기
  test.childNodes[9].nominfd

  

})

