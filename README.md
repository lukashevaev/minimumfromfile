# N-MINIMUM FROM FILE
## Поиск N-ного минимального элемента из XLSX-файла
Для реализации алгоритма была использована Priority Queue - упорядоченная очередь (в порядке убывания). Файл читается построчно и элементы сразу добавляются в очередь, где сортируются и в дальнейшем выводится N-ный элемент. 

* Запрос отправляется на порт 8081
* Путь до тестовых файлов: src/main/resources/files/
* Пример запроса: http://localhost:8081/min?filePath=src/main/resources/files/file2.xlsx&n=3

Swagger: http://localhost:8081/swagger-ui/index.html
