package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data921RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data922RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data923RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data924RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data925RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data926RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data927RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data928RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data929RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data930RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen093ViewModel @Inject constructor(
    private val repo1: Data921RepositoryImpl,
    private val repo2: Data922RepositoryImpl,
    private val repo3: Data923RepositoryImpl,
    private val repo4: Data924RepositoryImpl,
    private val repo5: Data925RepositoryImpl,
    private val repo6: Data926RepositoryImpl,
    private val repo7: Data927RepositoryImpl,
    private val repo8: Data928RepositoryImpl,
    private val repo9: Data929RepositoryImpl,
    private val repo10: Data930RepositoryImpl,

): ViewModel() {
}
