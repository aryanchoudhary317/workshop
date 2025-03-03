#include<stdio.h>
main(){
    int i,j;
    {
		printf("******************************");
	printf("*****SIMPLE PATTERN*****\n");
	printf("\n\n");
	
    
    for(i=1;i<=5;i++){
    	for(j=1;j<=i;j++){
    		printf("*",j);
		}
        printf("\n",i);
    }
}
	printf("\n *****REVERSE PATTERN***** ");
		printf("\n\n");
		
	{
		for(i=1;i<=5;i++){
			for(j=5;j>=i;j--){
				printf("*",j);
			}
			printf("\n",i);
		}
		
	}
	printf("\n\n******************************");

    return 0;
}