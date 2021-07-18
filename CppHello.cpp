#include <iostream.h>
#include <string.h>

void Swap(int &a, int &b){
	int temp;
	temp = a;
	a=b;
	b=temp;
}

//co ban
void InterchangeSort(int a[], int n){
	int i,j;
	for(i = 0 ; i < n-1 ; i++){
		for(j = i+1; j < n ; j ++){
			if(a[i]>a[j]){
				Swap(a[i],a[j]);		
			}
		}
	}
}

//duyet het tat ca mang, phan tu nao la be nhat roi cho no len dau mang
void SelectionSort(int a[], int n){
	int min,i,j;
	for(i = 0 ; i < n-1 ; i++){
		min = i;
		for(j = i+1 ; j < n;j++){
			if(a[min]>a[j]){
				min = j;
			}
			Swap(a[min],a[i]);
		}
	}
}


//load tat ca phan tu, tim phan tu be nhat, so sanh phan tu do voi lan luot cac phan tu truoc no
void BubbleSort(int a[], int n){
	int i,j;
	for(i =0;i<n;i++){
		for(j=n-1;j>i;j--){
			if(a[j]<a[j-1]){
				Swap(a[j-1],a[j]);
			}
		}
	} 
}

//cho i = 1 va pos se chay nguoc i, doi cho va chen a[i]
void InsertionSort(int a[], int n){
	int pos, i,x;
	for(i = 1 ; i < n ; i++){
		x = a[i];
		pos = i-1;
		while((pos>=0) && (a[pos]>x)){
			a[pos + 1] = a[pos];
			pos--;
		}
		a[pos + 1] = x;
	}
}

//doi cho cac phan tu con la max len lam cha
void Heapify(int a[], int n, int i){
	while(i<=(n/2)-1){
		int left = 2*i+1;
		int right = 2*i+2;
		int max = left;
		if(right<n && a[max]<a[right]){
			max = right;
		}
		if(a[max]>a[i]){
			Swap(a[i],a[max]);
		}
		i=max;
	}
}
//khoi tao 1 heap
void buildHeap(int a[], int n){
	for(int i = (n/2)-1; i >=0 ; i--){
		Heapify(a,n,i);
	}
}
//heapsort
void HeapSort(int a[], int n){
	buildHeap(a,n);
	for(int i = n-1; i>=0;i--){
		Swap(a[0],a[i]);
		Heapify(a,i,0);
	}
}

//chia thanh cac khoang cach roi chen nhu insertionSort
void ShellSort(int a[], int n, int divideBy){
	int i,j,gap,x;
	for(gap = n/divideBy ; gap>0; gap/=divideBy){
		for(i=gap;i<n;i++){
			x = a[i];
			j = i-gap;
			while(j>=0 && a[j]>x){
				a[j+gap] = a[j];
				j = j-gap;
			}
			a[j+gap] = x;
		}
	}	
}



void nhapmang(int a[], int n){
	for(int i = 0 ; i < n; i++){
    	cout<<"Nhap phan tu thu "<<i<<" : ";
    	cin>>a[i];
    }
}

void xuatmang(int a[],int n){
	for(int i = 0 ; i < n ; i++){
    	cout<<a[i]<<" ";
    }
}

int Fibo(int n){
	if(n<=2){
		return 1;
	}
	else
		return Fibo(n-1) + Fibo(n-2);
}
/*
void sapxep(int n){
	int k = 0;
	for(int i = 0 ; i < n ; i++){
		for(int j = 0 ; j <=i ; j++ ){
			k++;
			cout<<" "<<k;	
		}
		cout<<endl;
	}
}
*/
void QuickSort(int a[], int left, int right){
	int i,j,x;
	x = a[(left+right)/2];
	i = left;
	j = right;
	do{
		while(a[i]<x){
			i++;
		}	
		while(a[j]>x){
			j--;
		}
		if(i<=j){
			Swap(a[i],a[j]);
			i++;j--;
		}
	}while(i<=j);
	if(left<j){
		QuickSort(a,left,j);
	}
	if(i<right){
		QuickSort(a,i,right);
	}

}



int main()
{
    int *a;
    int n;
    
    //sapxep(8);
    /*
    a = new int[n];
    cout<<"Vui long nhap n: ";
    cin>>n;
    nhapmang(a,n);
   	cout<<"Cac phan tu lan luot la: ";
    xuatmang(a,n);
    cout<<endl;
    */
    
    int BusinessReject[] = {
    	8,9,10,34,35,49,52,372,379,380,58
    };
    
    int OrderCancelReject_OrderCancel_OrderCancelReplacement [] = {
    	37,11,41,39,1,58,434,102
    };

    int newOrder[] = {
    	37,11,17,150,39,103,1,55,54,38,44,59,151,14,6,60,58
    };
    int trade[] = {
    	37,11,17,150,39,1,55,54,38,44,32,31,151,14,6,60,442,555
    };
    int OrderCancelAcknowledgement[] = {
    	37,11,17,150,39,1,55,54,38,151,14,6,60
    };
    int OrderReplace[] = {
    	37,11,17,150,39,1,55,54,38,44,59,151,14,6,60
    };
    int CrossOrder[] = {
    	37,11,17,150,39,103,1,55,54,38,44,59,151,14,6,60,442,555
    };

    cout<<"New Order: ";
    for(int i = 0; i < sizeof(newOrder)/sizeof(newOrder[0]) ; i++){
    	cout<<newOrder[i]<<" ";
    }
    
    cout<<endl;
    
    cout<<"Trade: ";
    for(int i = 0; i < sizeof(trade)/sizeof(trade[0]) ; i++){
    	cout<<trade[i]<<" ";
    }
    
    cout<<endl;

	cout<<"OrderCancelAcknowledgement: ";
    for(int i = 0; i < sizeof(OrderCancelAcknowledgement)/sizeof(OrderCancelAcknowledgement[0]) ; i++){
    	cout<<OrderCancelAcknowledgement[i]<<" ";
    }
    
    cout<<endl;

	cout<<"OrderReplace: ";
    for(int i = 0; i < sizeof(OrderReplace)/sizeof(OrderReplace[0]) ; i++){
    	cout<<OrderReplace[i]<<" ";
    }
    
    cout<<endl;
    
    cout<<"CrossOrder: ";
    for(int i = 0; i < sizeof(CrossOrder)/sizeof(CrossOrder[0]) ; i++){
    	cout<<CrossOrder[i]<<" ";
    }
    
    cout<<endl;
    cout<<endl;
    
    
    //InterchangeSort(a,n);
    //SelectionSort(a,n);
    //BubbleSort(a,n);
    //InsertionSort(a,n);
    //ShellSort(a,n,2);
    
    //QuickSort(a,0,n-1);
    
    QuickSort(newOrder,0,(sizeof(newOrder)/sizeof(newOrder[0]))-1);
    QuickSort(trade,0,sizeof(trade)/sizeof(trade[0])-1);
    QuickSort(OrderCancelAcknowledgement,0,(sizeof(OrderCancelAcknowledgement)/sizeof(OrderCancelAcknowledgement[0]))-1);
    QuickSort(OrderReplace,0,(sizeof(OrderReplace)/sizeof(OrderReplace[0]))-1);
    QuickSort(CrossOrder,0,(sizeof(CrossOrder)/sizeof(CrossOrder[0]))-1);
    
   	cout<<"Cac phan tu sau khi sap xep la: "<<endl;
   	
   	cout<<"New Order: ";
    for(int i = 0; i < sizeof(newOrder)/sizeof(newOrder[0]) ; i++){
    	cout<<newOrder[i]<<" ";
    }
    
    cout<<endl;
    
    cout<<"Trade: ";
    for(int i = 0; i < sizeof(trade)/sizeof(trade[0]) ; i++){
    	cout<<trade[i]<<" ";
    }
    
    cout<<endl;

	cout<<"OrderCancelAcknowledgement: ";
    for(int i = 0; i < sizeof(OrderCancelAcknowledgement)/sizeof(OrderCancelAcknowledgement[0]) ; i++){
    	cout<<OrderCancelAcknowledgement[i]<<" ";
    }
    
    cout<<endl;

	cout<<"OrderReplace: ";
    for(int i = 0; i < sizeof(OrderReplace)/sizeof(OrderReplace[0]) ; i++){
    	cout<<OrderReplace[i]<<" ";
    }
    
    cout<<endl;
    
    cout<<"CrossOrder: ";
    for(int i = 0; i < sizeof(CrossOrder)/sizeof(CrossOrder[0]) ; i++){
    	cout<<CrossOrder[i]<<" ";
    }
    cout<<endl<<endl<<"-----------------------------------"<<endl;
    cout<<"Cac phan tu sau khi sap xep X2 la: "<<endl;
   	QuickSort(BusinessReject,0,sizeof(BusinessReject)/sizeof(BusinessReject[0])-1);
   	QuickSort(OrderCancelReject_OrderCancel_OrderCancelReplacement,0,sizeof(OrderCancelReject_OrderCancel_OrderCancelReplacement)/sizeof(OrderCancelReject_OrderCancel_OrderCancelReplacement[0])-1);
   	cout<<"New Order: ";
    for(int i = 0; i < sizeof(newOrder)/sizeof(newOrder[0]) ; i++){
    	cout<<newOrder[i]<<" ";
    } 
    
    cout<<endl;
     
    cout<<"BusinessReject: ";
    for(int i = 0; i < sizeof(BusinessReject)/sizeof(BusinessReject[0]) ; i++){
    	cout<<BusinessReject[i]<<" ";
    }
    
    cout<<endl;
    
    cout<<"OrderCancelReject: ";
    for(int i = 0; i < sizeof(OrderCancelReject_OrderCancel_OrderCancelReplacement)/sizeof(OrderCancelReject_OrderCancel_OrderCancelReplacement[0]) ; i++){
    	cout<<OrderCancelReject_OrderCancel_OrderCancelReplacement[i]<<" ";
    }
   	
    //HeapSort(a,n);
    //cout<<"Cac phan tu sau khi Heapsort la: ";
    //xuatmang(a,n);
    
    cout<<endl;
    cout<<endl;    
   
}
