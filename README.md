.replaceAll("(.)\\1+", ".");
정규표현식을 이걸로 해서 계속 오류냈음...

(.) <- 어떤 문자라도

\\1+ <- 연속되는 경우

"."으로 replaceAll

즉 연속되는 문자들은 한개의 .으로 묶임

예를 들어 "abbcccdddd" 의 경우 "a..."이 됨


.replaceAll("\\.+",".");

연속된 .들을 .한개로 바꾸어라

3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다. -> 문제 조건에 맞음
