#include <iostream>
#include <thread>
#include <chrono>
#include <algorithm>
#include <unistd.h>

using namespace std;
using namespace std::chrono;

 
void findEven() {
	for (int i = 0; i <= 1000; ++i){
        sleep(0.6);

		cout<<i<<endl;
	}
}
 
void findOdd() {
	for (int i = 0; i <= 1000; ++i){
        sleep(0.6);
		cout<<i<<endl;
	}
}
 
int main() {
 
	
 
    auto startTime = high_resolution_clock::now(); 
 
	// WITH THREAD
    // std::thread t1(findEven);
    // std::thread t2(findOdd);
 
	// t1.join();
	// t2.join();
 
	// WITHOUT THREAD
	findEven();
	findOdd();
    auto stopTime = high_resolution_clock::now(); 
    auto duration = duration_cast<microseconds>(stopTime - startTime);
 
	
 
	cout << "Sec: " << duration.count()/1000 << endl;
 
	return 0;
}