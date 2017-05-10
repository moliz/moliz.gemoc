# moliz.gemoc


## Development
Build Status [![Build Status](https://travis-ci.org/moliz/moliz.gemoc.svg?branch=master)](https://travis-ci.org/moliz/moliz.gemoc)

Update site built from the master branch is deployed here: [http://moliz.github.io/moliz.gemoc/updatesite/nightly/](http://moliz.github.io/moliz.gemoc/updatesite/nightly/)

Update site for [V1.0.0](https://github.com/moliz/moliz.gemoc/releases/tag/release.1.0.0) release: [http://moliz.github.io/moliz.gemoc/updatesite/1.0.0/](http://moliz.github.io/moliz.gemoc/updatesite/1.0.0/)

### How to set a new release

In order to get a new release, you can follow these steps on each of the _moliz.core_, _moliz.xmof_, and _moliz.gemoc_ repositories:
- add a tag with the following convention: `release.*` (where the wildcard would typically be a version such as _x.x.x_); push it to git
- wait for travis build to finish, this produces a zip in the [release tab](https://github.com/moliz/moliz.gemoc/releases) in github.
- add in [get-previous-releases.sh](https://github.com/moliz/moliz.gemoc/blob/master/get-previous-releases.sh) the lines allowing to download the new version from the release zip. (There is a similar file in each repository)
- update the [README.md](https://github.com/moliz/moliz.gemoc/blob/master/README.md) in order to reference the new update site in additon to the previous ones. (something like _http://moliz.github.io/moliz.gemoc/updatesite/x.x.x/_)
- you can now upgrade all versions in all _feature.xml_, _MANIFEST.MF_, _category.xml_, and _pom.xml_ files.
