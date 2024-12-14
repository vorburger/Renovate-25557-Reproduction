# 25557

Reproduction for [Renovate issue #25557](https://github.com/renovatebot/renovate/issues/25557).

## Current behavior

Renovate does not include changes to `MODULE.bazel.lock` in its PRs.

## Expected behavior

Renovate should include changes to `MODULE.bazel.lock` in its PRs.

## Link to the Renovate issue or Discussion

* https://github.com/renovatebot/renovate/discussions/31382
* https://github.com/renovatebot/renovate/issues/25557

## How To Reproduce

TODO Pull Request

1. [Install Bazelisk](https://github.com/bazelbuild/bazelisk?tab=readme-ov-file#installation)
1. Clone this Reproduce
1. Edit the `.bazelversion` file, and bump 7.4.1 to 8.0.0 (as the PR does)
1. `bazelisk run //:JavaOne`
1. `git status`

This will show the `MODULE.bazel.lock` file, which is committed to Git, as being "dirty" (i.e. having been modified by the version bump).

What we are saying with this Reproduction is that Renovate should include that file in its PRs.
