# Amphibians

> Practicing API and data handling

An Android app that fetches and displays information about amphibians from a REST API. Built as a practice project to reinforce concepts learned in **Android Basics with Compose - Unit 5** on networking and data handling.

---

## 🐸 About

**Amphibians** is a practice project that demonstrates fetching data from a REST API and displaying it in a list format. The app retrieves information about various amphibian species including their names, types, descriptions, and images.

This is a hands-on project to practice:
- REST API integration
- JSON parsing
- Image loading
- Repository pattern
- Modern Android architecture

---

## 🎯 Learning Focus

This project reinforces:

- **REST API Calls**: Fetching data from web services with Retrofit
- **JSON Serialization**: Parsing JSON responses with kotlinx.serialization
- **Repository Pattern**: Implementing clean architecture
- **Image Loading**: Using Coil for async image display
- **State Management**: Handling loading, success, and error states
- **Coroutines**: Managing asynchronous operations

---

## ✨ Features

- **Amphibian List**: Displays various amphibian species
- **Detailed Info**: Shows name, type, and description
- **Images**: Loads and displays amphibian photos
- **Error Handling**: Graceful error messages
- **Loading States**: Visual feedback during data fetch

---

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM with Repository Pattern
- **Networking**: Retrofit
- **JSON Parsing**: kotlinx.serialization
- **Image Loading**: Coil
- **Async Operations**: Kotlin Coroutines
- **Build System**: Gradle (Kotlin DSL)

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest stable version)
- JDK 8 or higher
- Internet connection

### Installation

1. **Clone the repository**:
```bash
   git clone https://github.com/SamratVsn/Amphibians.git
```

2. **Open in Android Studio**:
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned directory

3. **Run the app**:
   - Connect an Android device or start an emulator
   - Ensure internet connectivity
   - Click the "Run" button (▶️)

---

## 📱 App Structure
```
app/
├── data/
│   ├── AmphibianRepository.kt      # Data abstraction
│   └── NetworkAmphibianRepository.kt
├── model/
│   └── Amphibian.kt                # Data model
├── network/
│   └── AmphibianApiService.kt      # Retrofit service
├── ui/
│   ├── AmphibianViewModel.kt       # State management
│   └── screens/
│       └── HomeScreen.kt           # UI composables
└── AmphibianApplication.kt         # App container
```

---

## 📚 Key Concepts Implemented

### Architecture
- **Repository Pattern**: Clean separation between data and UI
- **Dependency Injection**: Manual DI with AppContainer
- **MVVM**: ViewModel manages UI state

### Networking
- **Retrofit Setup**: HTTP client configuration
- **JSON Parsing**: Automatic serialization/deserialization
- **Error Handling**: Try-catch for network failures

### UI
- **LazyColumn**: Efficient scrollable list
- **Coil AsyncImage**: Async image loading
- **State Management**: Loading, success, error states
- **Material Design**: Cards and consistent styling

---

## 💡 What I Practiced

- Setting up and configuring Retrofit
- Working with REST APIs and JSON data
- Implementing the Repository pattern
- Managing UI state with ViewModel
- Loading remote images with Coil
- Handling network errors gracefully
- Building responsive Compose UIs

---

## 🤝 Acknowledgments

Built as a practice project following concepts from Google's **Android Basics with Compose** course, Unit 5 on internet connectivity and data handling.

---

## 📄 License

This project is open source and available for educational purposes.

---

> "Practice makes progress."
