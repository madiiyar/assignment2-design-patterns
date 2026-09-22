# Assignment 2: Creational Patterns (Factory Method & Abstract Factory)

## 1. Custom Domain Theme
**Theme:** University Admission System
This project models the processes of university admissions, demonstrating the need for scalable object creation and strict compatibility between different admission components.

## 2. Part A: Factory Method (Single Product)
**Goal:** Refactor the creation of a single product (`Application`) so that subclasses decide which concrete application to instantiate.
- **Product Interface:** `Application` (contains the `process()` method)
- **Concrete Products:** `UndergraduateApplication`, `FoundationApplication`, `TransferApplication`.
- **Creator:** `ApplicationManager` (declares the `createApplication()` factory method and the `handleSubmission()` business method).
- **Concrete Creators:** `UndergraduateManager`, `FoundationManager`, `TransferManager`.

*Implementation note:* The client code only interacts with `ApplicationManager` and the `Application` interface, never hard-coding `new FoundationApplication()` directly. This respects the Open/Closed Principle.

## 3. Part B: Abstract Factory (Product Family)
**Goal:** Create a consistent family of related products where mixing components from different families is impossible.
- **Abstract Products:** `ApplicationForm` and `EntranceExam`.
- **Abstract Factory:** `UniversityFactory`
- **Concrete Factories:** `NazarbayevFactory` (generates NUET exam and NU-specific form) and `AstanaITFactory` (generates standard AITU test and housing form).

*Why Abstract Factory instead of Factory Method?*
This pattern guarantees that an applicant cannot mix a Nazarbayev University exam (NUET) with an Astana IT application form. The factory ensures the entire suite of admission requirements remains strictly compatible for the chosen university. The client (`AdmissionPortal`) receives the factory via composition and only works with abstract interfaces.