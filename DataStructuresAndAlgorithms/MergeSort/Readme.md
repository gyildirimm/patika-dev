### Merge Sort Example

####  [16,221,11,8,12,22] 



##### Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

> Adım1: 									[16,21,11,8,12,22]
> Adım2:				[16,21,11]							[8,12,22]
> Adım3:			[16,21]	[11]						[8,12]	[22]
> Adım4:		[16]	[21]	[11]					[8]	[12]	[22]
> Adım5:			[16,21]	[11]						[8,12]	[22]
> Adım6:				[11,16,21]							[8,12,22]
> Adım7:									[8,11,12,16,21,22]
##### Big-O gösterimini yazınız.

> 2^x=n den logn ve işlem n kere gerçekleşeceği için nlogn