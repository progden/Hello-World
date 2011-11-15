case 登入
	1. 取得使用者資料 (FB.api("/me"))
	2. 更新資料庫 (play data update)?
		. 更新User, Friendship 
case 1 下載資料
	1. 撈朋友資料
	2. 存DB			user 1-* friendship
	
case 2
	1. 從DB撈資料
	2. 顯示成graph (protovis)
		.關聯度 (個自的朋友數m1,m2 與 共同的朋友數c) = c*c/(m1*m2) 越靠近1越強
		.
case 3
	