FROM mariadb:10.7.3

EXPOSE 3306
# 設定ファイルをコンテナにコピー
COPY ./my.cnf /etc/mysql/my.cnf
# 設定ファイルの権限を変更
RUN chmod 644 /etc/mysql/my.cnf