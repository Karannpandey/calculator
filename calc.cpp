#include <iostream>
#include <cmath>  // for mathematical functions
using namespace std;

// Function to calculate factorial
unsigned long long factorial(int num) {
    if (num == 0) return 1;
    unsigned long long result = 1;
    for (int i = 1; i <= num; i++) {
        result *= i;
    }
    return result;
}

int main() {
    int choice;
    do {
        // Display the menu
        cout << "Select operation:" << endl;
        cout << "1. Square Root" << endl;
        cout << "2. Factorial" << endl;
        cout << "3. Natural Logarithm (ln)" << endl;
        cout << "4. Power (x^b)" << endl;
        cout << "5. Exit" << endl;

        // Get user input for choice
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                double x;
                cout << "Enter number: ";
                cin >> x;
                cout << "Square root of " << x << " is " << sqrt(x) << endl;
                break;
            }
            case 2: {
                int num;
                cout << "Enter number: ";
                cin >> num;
                cout << "Factorial of " << num << " is " << factorial(num) << endl;
                break;
            }
            case 3: {
                double n;
                cout << "Enter number: ";
                cin >> n;
                if (n <= 0) {
                    cout << "Natural log is undefined for numbers less than or equal to 0." << endl;
                } else {
                    cout << "Natural log of " << n << " is " << log(n) << endl;
                }
                break;
            }
            case 4: {
                double base, exponent;
                cout << "Enter base: ";
                cin >> base;
                cout << "Enter exponent: ";
                cin >> exponent;
                cout << base << "^" << exponent << " is " << pow(base, exponent) << endl;
                break;
            }
            case 5: {
                cout << "Exiting..." << endl;
                break;
            }
            default: {
                cout << "Invalid choice!" << endl;
            }
        }
        cout << endl;
    } while (choice != 5);

    return 0;
}
