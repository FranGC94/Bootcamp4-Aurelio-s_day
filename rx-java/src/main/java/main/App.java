package main;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class App {
	
  @SuppressWarnings("unchecked")
public static void main(String[] args) {
    Observable<String> messageSender = Observable.just("m1", "m2", "m3");
    
    messageSender.subscribe(new Observer() {

		@Override
		public void onSubscribe(Disposable d) {
			// TODO Auto-generated method stub
			System.out.println("Oberver1. Subscribed");
		}

		@Override
		public void onNext(Object t) {
			// TODO Auto-generated method stub
			System.out.println("Oberver1. Recived " + t);
			
		}

		@Override
		public void onError(Throwable e) {
			// TODO Auto-generated method stub
			System.out.println("Oberver1. Error " + e.getMessage());
			
		}

		@Override
		public void onComplete() {
			// TODO Auto-generated method stub
			System.out.println("Oberver1. Completed");
			
		}
    	
    });
    
    messageSender.subscribe(new Observer() {

		@Override
		public void onSubscribe(Disposable d) {
			// TODO Auto-generated method stub
			System.out.println("Oberver1. Subscribed");
		}

		@Override
		public void onNext(Object t) {
			// TODO Auto-generated method stub
			System.out.println("Oberver2. Recived " + t);
			
		}

		@Override
		public void onError(Throwable e) {
			// TODO Auto-generated method stub
			System.out.println("Oberver2. Error " + e.getMessage());
			
		}

		@Override
		public void onComplete() {
			// TODO Auto-generated method stub
			System.out.println("Oberver2. Completed");
			
		}
    	
    });
  }
}
