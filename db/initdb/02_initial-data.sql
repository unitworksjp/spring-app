-- 下記を流し直したい場合は、buildの前にvolumeを削除しておく
INSERT INTO spring_app_db.account (email, hashed_password, name) VALUES
('user1@example.com', 'password', 'テスト太郎'),
('user2@example.com', 'password', 'テスト次郎'),
('user3@example.com', 'password', 'テスト三郎')
;