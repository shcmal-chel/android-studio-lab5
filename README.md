# Лабораторная работа №5. 
Jetpack Compose: контейнеры, ARGB-модель и Material Design
## Описание
Цель работы: Повторить основы разработки пользовательского интерфейса на 
Jetpack Compose, работу с контейнерами Row и Column, познакомиться с ARGB
моделью цветов, компонентом Scaffold и принципами Material Design.
## Примеры кода
```kotlin
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleBlock()
        Spacer(modifier = Modifier.height(32.dp))
        RowOfColorBoxes()
        Spacer(modifier = Modifier.height(32.dp))
        CombinedBlock()
    }
}
```
## Автор
Шмаль Иван Максимович
## Лицензия
Проект создан в учебных целях.
