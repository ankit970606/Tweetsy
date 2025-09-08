# 🐦 Tweetsy  
A simple Jetpack Compose Android app that fetches and displays categorized tweets using Retrofit and Hilt dependency injection.

## 📱 Features  
- **Jetpack Compose UI** – Modern declarative UI for Android.  
- **MVVM Architecture** – Clean architecture using ViewModel, Repository, and StateFlow.  
- **Dependency Injection** – Powered by Hilt for easy and scalable DI.  
- **API Integration** – Fetch categories and tweets from [JSONBin.io](https://jsonbin.io).  
- **Navigation** – Smooth navigation between category screen and detail screen using Jetpack Navigation.  

---

## 🛠️ Tech Stack  
- **Language:** Kotlin  
- **UI:** Jetpack Compose, Material 3  
- **Architecture:** MVVM  
- **Networking:** Retrofit + Gson  
- **DI:** Hilt (Dagger)  
- **Asynchronous:** Kotlin Coroutines + StateFlow  

---

## 📂 Project Structure  

```plaintext
com.example.tweetsy
 ├── api/               # Retrofit API interface (TweetsyAPI)
 ├── di/                # Hilt DI module (NetworkModule)
 ├── models/            # Data models (TweetListItem)
 ├── repo/              # Repository layer (TweetRepo)
 ├── screens/           # Composable screens (CategoryScreen, DetailScreen)
 ├── ui.theme/          # Theme files (Color.kt, Theme.kt, Type.kt)
 ├── viewmodels/        # ViewModels (CategoryViewModel, DetailViewModel)
 ├── MainActivity.kt    # App entry point with NavHost
 └── Tweetsy.kt         # Application class annotated with @HiltAndroidApp
```

---


## 🔧 Setup & Installation  

1. **Clone the repository**  
```bash
git clone https://github.com/<your-username>/tweetsy.git
cd tweetsy
```

2. **Open in Android Studio**  
   - Open the project in **Android Studio Arctic Fox or newer**.  
   - Let Gradle sync and download dependencies.

3. **Run the App**  
   - Connect a device/emulator.  
   - Click ▶ Run or use `Shift + F10`.

---

## 🧠 How It Works  

- **CategoryViewModel** fetches categories from the API and emits them via `StateFlow`.  
- **CategoryScreen** observes these categories and displays them in a grid.  
- Clicking a category navigates to **DetailScreen**.  
- **DetailViewModel** fetches tweets based on the selected category and displays them in a list.  

---

## 📦 API Used  

Base URL:  
```text
https://api.jsonbin.io/v3/
```

Endpoints:  
- **GET Categories:** `/b/68bd42a943b1c97be939c80e?meta=false` (with `X-JSON-Path: $[*].category`)  
- **GET Tweets by Category:** `/b/68bd42a943b1c97be939c80e?meta=false` (with `X-JSON-Path` filter)  

---

## 📌 Requirements  
- Android Studio **Arctic Fox or newer**  
- Minimum SDK: **21 (Lollipop)**  
- Kotlin **1.8+**

---

## 🤝 Contributing  
Feel free to fork this project and submit a pull request. Contributions, issues, and feature requests are welcome!

---

## 📜 License  
This project is licensed under the [MIT License].
