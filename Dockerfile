FROM korekontrol/ubuntu-java-python2

# korekontrol/ubuntu-java-python2 base image by Marek Obuchowicz <marek@korekontrol.eu>
# Contains: openjdk-8-jre-headless \
#    libev4 libev-dev libpq-dev libldap2-dev libsasl2-dev libssl-dev \
#    python-dev python-pip \
#    python-numpy python-jinja2 python-suds python-psycopg2 python-pymysql \
#    python-snappy python-redis python-sh python-six python-dnspython \
#    python-pysnmp4 python-yaml python-requests python-setproctitle \
#    python-yapsy python-dogpile.cache

MAINTAINER Brian Baso <brianbaso@gmail.com>

# Install JEP
RUN pip install jep

# Set ENV vars
ENV LD_LIBRARY_PATH /usr/local/lib/python2.7/site-packages/jep/

