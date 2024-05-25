# Oliver Buteski 226023

## Control Flow Graph
![image](https://github.com/TheeOliver/SI_2024_lab2_226023/assets/116508471/25e029b1-086f-418d-8822-d2bc4b3b26e5)

## Цикломаткса комплексност

Цикломатската комплексност на дадениот код се пресметува преку формулата numE - numV + 2, каде numE е бројот на ребра, а numV е бројот на јазли. Во добиениот Control Flow Graph има 34 јазли и 42 ребра, па се добива 42-34+2=10. Па цикломатската комплекност на дадениот код е 10.

## Every Branch
Има 8 тестови:

1. Вредноста на параметарот allItems е null и се очекува програмата да фрли RuntimeException.

       allItems = null
2. allItems содржи елемент нема валиден баркод; содржи карактер кој не е цифра, па се очекува програмата да фрли RuntimeException.

       allItems = [["eggs", "o210", 68, 0.2]]

3. allItems содржи елемент чијшто баркод е еднаков на null, па се очекува програмата да фрли RuntimeException.

        allItems = [["eggs", null, 68, 0.2]]

4. allItems содржи елемент кој има име со должина 0, па се очекува програмата да му го додели името "unknown".

        allItems = [["", 0210, 68, 0.2]]

5. Сите елементи во листата немаат попуст, а сумата на цените е помала или еднаква на вредноста на payment и се очекува програмата да врати true.

        allItems = [["eggs", "0210", 68, 0], ["tuna", "2108", 72, 0]] и payment = 200

6. Сите елементи во листата немаат попуст, а сумата на цените е поголема од вредноста на payment и се очекува програмата да врати false.

        allItems = [["eggs", "0210", 68, 0], ["tuna", "2108", 72, 0], ["bananas", "3105", 78, 0]] и payment = 200

7. Сите елементи во листата имаат попуст, а сумата на цените е помала или еднаква на вредноста на payment и се очекува програмата да врати true.

        allItems = [["eggs", "0210", 68, 0.2], ["tuna", "2108", 72, 0.1]] и payment = 200

8. Сите елементи во листата имаат попуст, а сумата на цените е поголема од вредноста на payment и се очекува програмата да врати false.

        allItems = [["eggs", "0210", 68, 0.2], ["tuna", "2108", 72, 0.1f], ["bananas", "3105", 78, 0.3]] и payment = 200

Критериумот Every Branch е задоволен со овие тест приери.

## Multiple Condition
Даден е условот
`if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')`
со кој се проверува дали за продуктот следува дополнителен попуст и за истиот имаме 4 тестови:

1. Доколку цената на продуктот е помала или еднаква на 300.

        item = ["eggs", "3105", 210, 0.2]

2. Доколку цената на продуктот е поголема од 300, но нема попуст.

        item = ["eggs", "3105", 350, 0]

3. Доколку цената на продуктот е поголема од 300, има попуст, но баркодот почнува со 0.

        item = ["eggs", "0210", 350, 0.2]

4. Доколку цената на продуктот е поголема од 300, има попуст и баркодот не почнува со 0.

        item = ["eggs", "3105", 350, 0.2]

Критериумот Multiple Condition е задоволен со овие тест примери.

## Објаснување на напишаните unit tests
Објаснувањата на unit tests се наоѓаат во самите делови за Every Branch и Multiple Choice
