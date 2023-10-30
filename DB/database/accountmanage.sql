--------------------------------------------------
-- root 계정에서 실행 
--------------------------------------------------
CREATE user kosta IDENTIFIED BY '1234'; -- 계정 생성(root만 가능)
ALTER user kosta IDENTIFIED BY '2345'; -- 계정의 비밀번호 변경
DROP user kosta;

-- kosta 계정에 testdb SELECT, INSERT, UPDATE 권한 부여
GRANT SELECT, INSERT, UPDATE ON testdb.* TO 'kosta';

-- kosta 계정에 testdb의 모든 권한 부여
GRANT ALL PRIVILEGES ON testdb.* TO 'kosta';

-- kosta 계정에 DB의 모든 권한 부여
GRANT ALL PRIVILEGES ON *.* TO 'kosta';

SHOW GRANTS FOR 'kosta';


-- kosta에서 update 권한 삭제
REVOKE UPDATE ON testdb.* FROM 'kosta';

--------------------------------------------------
-- kosta 계정에서 확인 
--------------------------------------------------
SELECT * FROM account;
DELETE FROM account WHERE id='10001'; -- error : delete 권한 없음




